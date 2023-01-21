//the adapter must provide an alternative action for the methods that need to be used because enemyAttacker was implemented
public class enemyRobotAdapter implements enemyAttacker
{
    enemyRobot theRobot = new enemyRobot();

    public enemyRobotAdapter(enemyRobot newRobot)
    {
        theRobot = newRobot;
    }
    public void fireWeapon()
    {
        theRobot.smashWithHands();
    }
    public void driveForward()
    {
        theRobot.walkForward();
    }
    public void assignDriver(String driverName)
    {
        theRobot.reactToHuman(driverName);
    }
}
