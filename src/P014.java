public class P014 {
    public static void main(String[] args){
        int color = 0xFF;
        switch ("赤"){
            case "青":
                color |=0xFF<<8;
                break;
            case "赤":
                color |=0xFF<<24;
                break;
            case "緑":
                color |=0xFF<<16;
            default:
        }
    }
}
