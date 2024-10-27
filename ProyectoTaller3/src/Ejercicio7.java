public class Ejercicio7 {
    public static void main(String[] args) {        
        int v1,v2, v3, v4, v5, v6, v7, v8, v9;
        boolean respuesta1;
        v1 = 81;
        v2 = 9;
        v3 = 3;
        v4 = 9;
        v5 = 10;
        v6 = 1;
        v7 = 100;
        v8 = 25;
        v9 = 100;
        respuesta1 = (((Math.sqrt(v1) + v2) / v3 == v4) || (v5 > v6) && (v7 / v8 + Math.sqrt(v9) > 0));
        System.out.println("respuesta1 = " + respuesta1);       
    }
}
