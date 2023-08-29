public class NEXT_SMALLEST_ELEMENT
{
    public static void main(String []arg)
    {
        int arr[]={10,7,9,3,2,1,15};

        int size=arr.length;
        int temp[]=new int [size];
        boolean bool;

        for(int i=0;i<size;i++)
        {
            bool=true;
            
            for(int j=i+1;j<size;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp[i]=arr[j];
                    bool=false;
                    break;

                }
            }

            if(bool!=false)
            {
                temp[i]= -1;
            }
        }

        for(int i=0;i<size;i++)
        {
            System.out.print(" "+temp[i]);
        }

    }

}