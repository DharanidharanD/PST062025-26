public class Inherit {
    public static void main(String[] args){

    }
}
class parent{
    int r(){
        return 0;
    }
}
class child extends parent{
    String o(){
        return String.valueOf(0);
    }
}
class grandchild extends child{
    Boolean s(){
        return true;
    }
}
class greatgrandchild extends grandchild{
    char e(){
        return 0;
    }
}