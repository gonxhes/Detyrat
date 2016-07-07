/** BounceController controls two moving balls.  */
public class BounceController2
{ private MovingBall ball1;  // model object
  private MovingBall ball2;  // model object
  private AnimationWriter2 writer; // output-view object
  /** Constructor BounceController initializes the controller
    * @param b1 - a ball
    * @param b2 - another ball
    * @param w - the output-view object  */
  public BounceController2(MovingBall b1, MovingBall b2, AnimationWriter2 w)
  { ball1 = b1;
    ball2 = b2;
    writer = w;
   }

  /** runAnimation  runs the animation by means of an internal clock */
  public void runAnimation()
  { while ( true )
          { delay(20);   // delay 20 milliseconds --- one clock ``tick''
            ball1.move(1);
            ball2.move(1);
            writer.repaint();  // redisplay box and ball
      
          }
  }

  /** delay pauses execution for  how_long  milliseconds */
  private void delay(int how_long)
  { try { Thread.sleep(how_long); }
    catch (InterruptedException e) { }
  }
}