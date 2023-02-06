public class Promedio{
  public static void main(String arcs[]){

   float mat = 7;
   float bio = 6;
   float quim = 8;
   float prom = 0;

   prom = (mat + bio + quim)/3;

   if(prom >= 6){
     System.out.println("El alumno aprobó con calficación: " + prom);

   } else {
     System.out.println("El alumno reprobó con calificación: " + prom);
     
   }
 }
}