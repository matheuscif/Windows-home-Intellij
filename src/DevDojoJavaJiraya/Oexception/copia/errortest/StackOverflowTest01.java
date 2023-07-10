package DevDojoJavaJiraya.Oexception.copia.errortest;

public class StackOverflowTest01 {
    public static void main(String[] args) {

    }
    public static void recursividasde(){
        recursividasde(); // pra explicar erro de recursividade (chamada infinita)
    }
}
