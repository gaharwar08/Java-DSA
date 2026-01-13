package Revision;
class searchElement{
    int presentElement() {
        int arr[] = {10, 20, 30, 40, 50, 30};
        int x = 30;
        int ans = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                ans = i;
                System.out.println(ans);
                break;

            }
        }
        return ans;
    }
}

public class R78 {
    public static void main(String[] args) {
        searchElement obj = new searchElement();
        obj.presentElement();

    }
}
