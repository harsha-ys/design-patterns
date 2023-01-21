public class test 
{
    public static void main(String[] args) 
    {
        enemyRobot Robot = new enemyRobot();
        enemyAttacker adapter = new enemyRobotAdapter(Robot);

        adapter.assignDriver("harshana");
        adapter.driveForward();
        adapter.fireWeapon();
    }    
}
