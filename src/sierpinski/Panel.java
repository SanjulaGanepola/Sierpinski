/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sierpinski;

import java.awt.Graphics;

/**
 *
 * @author 348676487
 */
public class Panel extends javax.swing.JPanel {

    /**
     * Creates new form Panel
     */
    public Panel() {
        initComponents();
    }
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //Draw a the sierpinskis triangle fractal pattern
        sierpinski(g, 5, this.getWidth() / 2, this.getHeight(), 200);
    }

    /**
     * Given the number of iterations, the coordinates of the triangle, and the
     * size of its lines, draw a sierpinski's triangle fractal pattern.
     *
     * @param g The Graphics object to protect
     * @param n Number of times to repeat the pattern.
     * @param x The x coordinate of the triangle.
     * @param y The y coordinate of the triangle.
     * @param size The length of a triangle's line.
     */
    public void sierpinski(Graphics g, int n, int x, int y, int size) {
        //Draw a triangle
        triangle(g, x, y, size);

        //Recurse until n is reached
        if (n > 0) {
            //Left of the triangle
            sierpinski(g, n - 1, x - size / 2, y, size / 2);
            //Right of the triangle
            sierpinski(g, n - 1, x + size / 2, y, size / 2);
            //Above the triangle
            sierpinski(g, n - 1, x, y - size, size / 2);
        }
    }

    /**
     * Given the coorindates of a triangle, and the size of its lines, draw a
     * triangle.
     *
     * @param g The Graphics object to protect
     * @param x The x coordinate of the triangle.
     * @param y The y coordinate of the triangle.
     * @param size The length of a triangle's line.
     */
    public void triangle(Graphics g, int x, int y, int size) {
        //Bottom to right line
        g.drawLine(x, y, x + size / 2, y - size);
        //Bottom to left line
        g.drawLine(x, y, x - size / 2, y - size);
        //Left to right line
        g.drawLine(x - size / 2, y - size, x + size / 2, y - size);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
