package com.superlee.principle.ocp;

/**
 * @author : lichao892
 * @date : 2019/10/21 16:26
 * <p>
 * 描述 :    TODO
 */

public class Ocp {

    public static void main(String[] args) {
        GraphicEditor graphicEditor = new GraphicEditor();
        graphicEditor.drawShape(new Rectangle());
        graphicEditor.drawShape(new Circle());
    }
}

class GraphicEditor {
    public void drawShape(Shape s) {
        if (s.m_type == 1) {
            drawRectangle(s);
        } else if (s.m_type == 2) {
            drawCircle(s);
        }
    }

    public void drawRectangle(Shape r) {
        System.out.println("绘制矩形");
    }

    public void drawCircle(Shape r) {
        System.out.println("绘制圆形");
    }
}

// 基类
class Shape {
    int m_type;
}

class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }
}

class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }
}