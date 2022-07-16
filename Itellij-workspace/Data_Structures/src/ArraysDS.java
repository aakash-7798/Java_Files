// Inserting,Updating,Deleting,Searching ,Removing Duplicates From Arrays

import java.util.*;
class ArraysDS{
    private int[] a;
    private int nele;
    public ArraysDS(int size){
        a = new int[size];
        nele=0;
    }
    public void print()
    {
        for(int i=0;i<nele;i++){System.out.print(a[i]+" ");}
        System.out.println();
    }
    public void insert(int val)
    {
        a[nele] = val;
        nele++;
    }
    public int search(int key)
    {
        int i;
        for(i=0;i<nele;i++)
        {
            if(a[i]==key)
            {
                break;
            }
        }
        if(i==nele)
        {
            return -1;
        }
        else
        {
            return i;
        }
    }
    public int[] search1(int key)
    {
        int index = 0;
        int a1[] = a;
        boolean flag = false;
        for(int i=0;i<nele;i++)
        {
            if(a[i]==key)
            {
                a1[index] = i;
                index++;
                flag = true;
            }
        }
        if(flag==false){
            int[] s = new int[1];
            s[0] = -1;
            return s;
        }
        else {
            int[] s = Arrays.copyOfRange(a1, 0, index);
            return s;
        }
    }
    public int getMax()
    {
        if(nele==0){return -1;}
        int max = a[0];
        for(int i=1;i<nele;i++)
        {
            if(a[i]>max){max=a[i];}
        }
        return max;
    }
    public int getMin()
    {
        if(nele==0){return -1;}
        int min = a[0];
        for(int i=1;i<nele;i++)
        {
            if(a[i]<min){min=a[i];}
        }
        return min;
    }
    public int[] delete(int val)
    {
        int[] a1 = a;
        int index = search(val);
        if(index!=-1)
        {
            for(int i=index;i<nele-1;i++)
            {
                a1[i] = a1[i+1];
            }
            nele--;
            return a1;
        }
        else{
            int[] idx = new int[1];
            idx[0] = -1;
            return idx;
        }
    }
    public int[] delete1(int key)
    {
        int index = 0;
        int a1[] = a;
        int ct=0;
        for(int i=0;i<nele;i++)
        {
            if(a[i]==key){ct++;}
            if(a[i]!=key)
            {
                a1[index] = a[i];
                index++;
            }
        }
        if(ct>=1)
        {
            int[] s = Arrays.copyOfRange(a1, 0, index);
            return s;
        }
        else
        {
            int[] s = new int[1];
            s[0] = -1;
            return s;
        }
    }

    public void unique()
    {
        int value = 0;
        for(int i=0;i<nele;i++)
        {
            value = a[i];
            for(int j=i+1;j<nele;j++)
            {
                if(a[j]==value)
                {
                    for(int k=j;k<(nele)-1;k++)
                    {
                        a[k] = a[k+1];
                    }
                    nele--;
                    j--;
                }
            }
        }
    }
}
class Arrays_Data_Structure{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter how many elements you want to insert : ");
        int ins = s.nextInt();
        ArraysDS arr =  new ArraysDS(ins);
        System.out.print("Enter Elements : ");
        for(int i=0;i<ins;i++)
        {
            arr.insert(s.nextInt());
        }
        System.out.print("         Elements Inserted Successfully.... "+"\n\n");
        System.out.print("Array Elements After Insertion : ");
        arr.print();
        System.out.println();
        System.out.print("Below are the operations we can perform from above created Array "+"\n"+
                "1.Get Unique Elements  " +
                "2.Search an Element  " +
                "3.Find Maximum Element  " +
                "4.Find Minimum Element  " +
                "5.Delete Elements  "+"\n\n");
        System.out.print("Enter Above Mentioned Number to Perform Required Operations : ");
        int num = s.nextInt();
        switch (num)
        {
            case 1:
                arr.unique();
                System.out.print("Unique Elements : ");
//                for(int i=0;i<arr1.length;i++){System.out.print(arr1[i]+" ");}
                arr.print();
                System.out.println();
                break;
            case 2:
                System.out.print(" Operations we can perform "+" 1. search only first occurrence "+" 2. searches all occurrences "+"\n");
                System.out.print("Enter Above Mentioned Number to Perform Required Operations : ");
                int srnum = s.nextInt();
                switch (srnum)
                {
                    case 1:
                        System.out.print("Enter value to be searched : ");
                        int key = s.nextInt();
                        int srch = arr.search(key);
                        if(srch==-1){System.out.print("Element Not Found ..");}
                        else{System.out.print("Element Found at Index : "+srch);}
                        System.out.println();
                        break;
                    case 2:
                        System.out.print("Enter value to be searched : ");
                        int key1 = s.nextInt();
                        int[] srch1 =  arr.search1(key1);
                        if(srch1[0]!=-1)
                        {
                            if(srch1.length==1){System.out.print("Element Found at Index : ");}
                            else{System.out.print("Elements Found at Indices : ");}
                            for(int i=0;i<srch1.length;i++)
                            {
                                System.out.print(srch1[i]+" ");
                            }
                        }
                        else {System.out.print("Element Not Found ..");}
                        System.out.println();
                        break;
                }
            case 3:
                System.out.print("Maximum Element in the Array : "+arr.getMax());
                break;
            case 4:
                System.out.print("Minimum Element in the Array : "+arr.getMin());
                break;
            case 5:
                System.out.print(" Operations we can perform "+" 1. Deletes only first occurrence "+" 2. Deletes all occurrences "+"\n");
                System.out.print("Enter Above Mentioned Number to Perform Required Operations : ");
                int denum = s.nextInt();
                switch (denum)
                {
                    case 1:
                        System.out.println();
                        System.out.print("Array Elements Before Deletion : ");
                        arr.print();
                        System.out.print("Enter which value you want to delete from array : ");
                        int del = s.nextInt();
                        int[] delarr = arr.delete(del);
                        if(delarr.length==1 && delarr[0]==-1){System.out.print("Unable to delete as element is not present in array..");}
                        else{System.out.print("Value "+del+" Deleted Successfully......"+"\n");}
                        System.out.print("Array Elements After Deletion : ");
                         for(int d=0;d<delarr.length;d++){System.out.print(delarr[d]+" ");};
                        System.out.println();
                        break;
                    case 2:
                        System.out.println();
                        System.out.print("Array Elements Before Deletion : ");
                        arr.print();
                        System.out.print("Enter which value you want to delete from array : ");
                        int del1 = s.nextInt();
                        int[] delearr = arr.delete1(del1);
                        if(delearr!=null &&delearr.length>=1 && delearr[0]!=-1)
                        {
                            System.out.print("Array Elements After Deletion : ");
                            for(int i=0;i<delearr.length;i++)
                            {
                                System.out.print(delearr[i]+" ");
                            }
                        }
                        else
                        {
                            System.out.print(" !!!!   .... Element Not Found Deletion not possible...... "+"\n");
                            System.out.print("Array Elements After Deletion : ");
                            arr.print();
                        }
                    System.out.println();


                }

        }

    }
}

//1 2 3 3 5 5 6 4 3 1
//1 2 4 4 4 4 5 5 5 6 7 8 9 5 2 1 1 1 8 8