import java.util.*;
public class ProductOfArrayExceptSelf_1 {
        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.print("How many elements you want to consider : ");
            int ele = s.nextInt();
            int[] nums = new int[ele];
            System.out.print("Enter elements : ");
            for(int i=0;i<ele;i++)
            {
                nums[i] = s.nextInt();
            }
            int[] new_nums = new int[nums.length];
            for(int i=0;i<nums.length;i++)
            {
                int pd = 1;
                for(int j=0;j<nums.length;j++)
                {
                    if(i==j)
                    {
                        continue;
                    }
                    pd*=(nums[j]);
                }
                new_nums[i] = pd;
            }
            System.out.print("Product Except itself Array : ");
            for(int i=0;i<new_nums.length;i++)
            {

                System.out.print(new_nums[i]+" ");
            }

        }
    }
