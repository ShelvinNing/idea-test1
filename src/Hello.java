import com.sun.jdi.PathSearchingVirtualMachine;

/**
 * @auther shelvin
 * @date 2022/2/24 - 10:48
 */
public class Hello {
    public static void main(String[] args) {

        String[] arr = new String[]{"Tom","jerry","shelvin"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println(s);

        }
    }



}
