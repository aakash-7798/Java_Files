public class List_ADT_Using_Arrays {
    private int[] lst ;
    private int size;
    private int nele;
    List_ADT_Using_Arrays(int sz)
    {
        lst = new int[sz];
        size=sz;
        nele=0;
    }
    public void add_ele(int value)
    {
        lst[nele] = value;
        nele++;
    }
    public void get_ele(int index) {
        if (index<0 || index >= size) {
            System.out.print("\nList index out of Bounds.....  the index you are trying to find is greater than list size.. or negative number\n");
            return;
        }
        else {
            int idx=0;
            for (int i = 0; i < size; i++) {
                if (index == i) {
                    break;
                }
                idx++;
            }
            System.out.print("\nValue at index "+index+" is "+lst[idx]+"\n");
        }
    }


    public void remove_using_index(int index)
    {
        if(index<0 || index>=size)
        {
            System.out.print("\nList index out of Bounds.....  the index you are trying to find is greater than list size.. or negative number\n");
            return;
        }
        System.out.print("\n           Indexing Starts From 0 ");
        System.out.print("\nBefore Deleting \n");
        print_list();
        size--;
        for(int i=index;i<size;i++)
        {
            lst[i] = lst[i+1];
        }
        System.out.print("After Deleting Index "+index+"\n");
        print_list();
    }
    public void delete_first_occur(int value)
    {
        boolean flag = false;
        int index = 0;
        for(int i=0;i<size;i++)
        {
            if(lst[i]==value) {flag=true;break;}
            index++;
        }
        if(flag==false)
        {
            System.out.print("\nThe element you are trying to delete is not present in the list.....\n");
            return;
        }
        else{
            System.out.print("\nBefore Deleting\n");
            print_list();
            size--;
            for(int i=index;i<size;i++)
            {
                lst[i] = lst[i+1];
            }
            System.out.print("After Deleting First Occurrence of value "+value+"\n");
            print_list();
        }

    }

//    Below Function is similar to Arrays.copy  (just creating from scratch)
    public int[] List_trim_elements(int[] arr,int start_index,int end_index)
    {
        int[] copy = new int[(end_index-start_index)];
        if(start_index<0 && end_index>=size)
        {
            System.out.print("\nList index out of Bounds.....  the index you are trying to find is greater than list size.. or negative number\n");
        }
        int idx = 0;
        for(int i=start_index;i<end_index;i++)
        {
            copy[idx++] = arr[i];
        }
        return copy;
    }

    public void delete_all_occur(int value)
    {
        int index = 0;
        int[] lst1 = new int[size];
        int ct=0;
        for(int i=0;i<size;i++)
        {
            if(lst[i]==value){ct++;}
            if(lst[i]!=value) {
                lst1[index++] = lst[i];
            }
        }
        if(ct==0)
        {
            System.out.print("\nThe element you are trying to delete is not present in the list.....\n");
            return;
        }
        else{
            System.out.print("\nBefore Deleting\n");
            print_list();
            lst = List_trim_elements(lst1,0,index);
            size = index;
            System.out.print("After Deleting "+ct+" Occurrences of "+value+"\n");
            print_list();
        }
    }

//     You can use any Sorting technique for making code lesser i am considering insertion...
    public void sort_list()
    {
        int[] lst1 = lst;
        for(int i=1;i<lst1.length;i++)
        {
            int j=i-1;
            while(j>=0)
            {
                if(lst1[j]>lst1[j+1])
                {
                    int temp = lst1[j];
                    lst1[j] = lst1[j+1];
                    lst1[j+1] = temp;
                }
                j--;
            }
        }
        System.out.print("\n\nSorted Elements -> [");
        for(int i=0;i<lst1.length-1;i++) {System.out.print(lst1[i]+",");} System.out.print(lst1[lst1.length-1]+"]\n");
    }
    public void print_unique_ele(int[] arr)
    {
        if(arr==null)
        {
            System.out.print("Empty List... -> []");
            return;
        }
        System.out.print("\nUnique Elements -> ");
        int ct = arr.length;
        for(int i=0;i<arr.length;i++)
        {
            boolean flag = false;
            for(int j=0;j<i;j++)
            {
                if(arr[j]==arr[i]){flag = true;ct--;break;}
            }
            if(flag==false)
            {
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();

    }
    public void print_unique_ele_asList(int[] arr)
    {
        if(arr==null)
        {
            System.out.print("Empty List... -> []");
            return;
        }
        int[] arr1 = arr;
        int nsz = arr1.length;
        for(int i=0;i<nsz;i++)
        {
            for(int j=i+1;j<nsz;j++)
            {
                if(arr1[j]==arr1[i])
                {
                    for(int k=j;k<nsz-1;k++)
                    {
                        arr1[k] = arr1[k+1];
                    }
                    nsz--;
                    j--;
                }
            }
        }
        System.out.print("\nUnique Elements -> [");
        for(int a=0;a<nsz-1;a++)
        {
            System.out.print(arr1[a]+",");
        }
        System.out.print(arr1[nsz-1]+"]");
    }
    public void print_list()
    {
        System.out.print("List Elements -> "+"[");
        for(int i=0;i<size-1;i++) {System.out.print(lst[i]+",");}
        System.out.print(lst[size-1]+"]"+"\n");
        System.out.print("Size : "+size+"\n");
    }
    public static void print_list1(int[] arr)
    {
        System.out.print("List Elements -> "+"[");
        for(int i=0;i< arr.length-1;i++) {System.out.print(arr[i]+",");}
        System.out.print(arr[arr.length-1]+"]"+"\n");
        System.out.print("Size : "+arr.length+"\n");
    }

    public static void main(String[] args) {
        int arr[] = {1,4,2,7,8,9,2,3,3,5,4,7,5,3,1,2,5};
//        int arr[] = {1,2,5,4,1,2,3,5,3,4,5,6,7};
        List_ADT_Using_Arrays lt = new List_ADT_Using_Arrays(arr.length);
        for(int i=0;i<lt.size;i++)
        {
            lt.add_ele(arr[i]);
        }
        lt.print_list();
        int[] sub_list = lt.List_trim_elements(arr,4, 8);
        System.out.print("\nSub");print_list1(sub_list);
//        System.out.print("\nSublist Elements -> [");for(int i=0;i<sub_list.length-1;i++) {System.out.print(sub_list[i]+",");}System.out.print(sub_list[sub_list.length-1]+"]"+"\n");
        lt.remove_using_index(-1);
        lt.get_ele(2);
        lt.delete_first_occur(3);
        lt.delete_all_occur(2);
        lt.delete_all_occur(40);
        lt.print_unique_ele(arr);
        lt.print_unique_ele_asList(arr);
        lt.sort_list();
    }
}
