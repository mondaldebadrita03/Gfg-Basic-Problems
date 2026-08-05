import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> quadraticRoots(int a, int b, int c) {
        ArrayList<Integer> roots = new ArrayList<>();
        double d = (double) b * b - 4.0 * a * c;
        if (d < 0) {
            roots.add(-1);
            return roots;
        }
        double r1 = (-b + Math.sqrt(d)) / (2.0 * a);
        double r2 = (-b - Math.sqrt(d)) / (2.0 * a);
        int root1 = (int) Math.floor(r1);
        int root2 = (int) Math.floor(r2);
        if (root1 >= root2) {
            roots.add(root1);
            roots.add(root2);
        } else {
            roots.add(root2);
            roots.add(root1);
        }
        
        return roots;
    }
}
