public class PythagoreanCheck {
  public static boolean isPythagoreanTriplet(int a, int b, int c) {
      // Sort the numbers to ensure c is the largest
      int x = Math.min(a, Math.min(b, c));
      int z = Math.max(a, Math.max(b, c));
      int y = a + b + c - x - z; // Middle value

      // Check if Pythagorean condition holds
      return (x * x + y * y == z * z);
  }

  public static void main(String[] args) {
      int a = 3, b = 4, c = 5;
      
      if (isPythagoreanTriplet(a, b, c)) {
          System.out.println("Yes, (" + a + ", " + b + ", " + c + ") is a Pythagorean triplet.");
      } else {
          System.out.println("No, it is not a Pythagorean triplet.");
      }
  }
}
