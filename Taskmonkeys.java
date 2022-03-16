/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taskmonkeys;

/**
 *
 * @author DIVYA
 */
public class Taskmonkeys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int doors[]=new int[101];
        int opened[]=new int[20];
        status s=new status();
        int ind=1;
        for(int monkeys=1;monkeys<doors.length;monkeys++)
        {
            doors[monkeys]=s.statusDoors(monkeys);
            if(doors[monkeys]==1)
            {
                
                System.out.println(monkeys + " - opened");
                opened[ind]=monkeys;
                ind++;
            }
            else
            {
                System.out.println(monkeys+ " - closed");
            }
        }
        System.out.print("Opened Doors--");
        for(int monkeys=1;monkeys<opened.length;monkeys++)
        {
            
            if(opened[monkeys]==0)
            {
                break;
            }
            System.out.print(opened[monkeys]+ " ");
            
        }
        
        
        
    }
    
}
class status{
public int statusDoors(int a)
{
int countfactors=0;
for(int number=1;number<=a;number++)
{
   if(a%number==0)
   {
       countfactors++;
   }     
}
if(countfactors%2==0)
{
    return 2;
}
else
{
    return 1;
}
}
}