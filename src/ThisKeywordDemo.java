import java.util.Scanner;

class ThisDemo {
    int value;

    // TODO: Define setValue(int value)
    // Use 'this.value = value' to resolve naming conflict
    void setValue(int value) {
        this.value = value;
    }
    
    // TODO: Define display() to print "Value: " + value
    void display() {
        System.out.println("Value: " + this.value);
    }
}

public class ThisKeywordDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // TODO: Read the integer input
        if (sc.hasNextInt()) {
            int inputValue = sc.nextInt();
            
            // TODO: Create ThisDemo object
            ThisDemo obj = new ThisDemo();
            
            // TODO: Call setValue() with the input
            obj.setValue(inputValue);
            
            // TODO: Call display()
            obj.display();
        }
        
        sc.close();
    }
}
