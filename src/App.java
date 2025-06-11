

import controllers.QueueG;
import controllers.Stack;
import controllers.StackG;
import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(-1);
        stack.push(5);
        stack.push(8);
        //System.out.println(stack.pop());
        //System.out.println(stack.peek());

        System.out.println("Tam= "+stack.size());
        stack.printStack();
        stack.pop();
        System.out.println("Tam= "+stack.size());
        stack.printStack();

        System.out.println("  ");

        StackG<Integer> pilaG = new StackG<Integer>();
        pilaG.push(5);
        pilaG.push(-1);
        pilaG.push(8);
        pilaG.push(10);

        System.out.println("Tam = "+pilaG.size());
        pilaG.printStack();
        pilaG.push(null);

        Persona p1 = new Persona("Juan");
        Persona p2 = new Persona("Maria");
        Persona p3 = new Persona("Pedro");
        Persona p4 = new Persona("David");

        QueueG<Persona> colaPe = new QueueG<Persona>();
        colaPe.add(p1);
        colaPe.add(p2);
        colaPe.add(p3);
        colaPe.add(p4);
        colaPe.printStack();
        System.out.println("Persona atendida: "+colaPe.remove());
        colaPe.printStack();
        Persona pB = colaPe.findByName("Juan");
        System.out.println("Persona encontrada = "+pB);
        Persona pE = colaPe.deleteByName("Pedro");
        System.out.println("Persona eliminada= "+pE);
        colaPe.printStack();

    }
}
