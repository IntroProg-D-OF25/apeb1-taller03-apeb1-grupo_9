
public class Ejercicio8 {
    public static void main(String[] args) {
        double v1, v2, v3, v4, v5, v6, v7, v8, v9, v10, v11;
        boolean respuesta;
        v1 = 10;
        v2 = 9;
        v3 = 20;
        v4 = 500;
        v5 = 2;
        v6 = 3;
        v7 = 200;
        v8 = 50;
        v9 = 50;
        v10 = 50;
        v11 = 51;
        respuesta = (((v1*v2) + v3 - v4 / v5 + Math.pow(v6, 2) >= v7) || (v8 >= v9 - v10 +v11));
        System.out.println("respuesta = " + respuesta);
    }
  
}
