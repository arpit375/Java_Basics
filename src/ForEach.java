public class ForEach {
    public static void main(String[] args) {
        String[] mobile = {"Samsung","Apple", "Google", "Xiaomi" };
        System.out.println("unsorted String array of mobiles");
        for (String i : mobile
             ) {
            System.out.println(i);
        }
        for(int i =0; i< mobile.length-1;i++)
        {
            for(int j= i+1; j<mobile.length;j++)
            {
                if(mobile[i].compareTo(mobile[j])>0)        // Sorting
                {
                    String temp = mobile[i];        // Swapping
                    mobile[i] = mobile[j];
                    mobile[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("sorted String array of mobiles");
        for (String i : mobile
        ) {
            System.out.println(i);
        }
    }
}
