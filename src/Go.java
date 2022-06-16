public class Go {
    public static void main(String[] args) {
        char q = (char) 96;
        String jp = """
public class Go {
    public static void main(String[] args) {
        char q = (char) 96;
        String jp = %s;
        String gp = %s;
        System.out.printf(gp, q+jp+q, q+gp+q);
    }
}""";
        String gp = """
package main

import (
	"fmt"
	"strings"
)

func main() {
	q := strings.Repeat(string(34), 3)
	jp := %s
	gp := %s
	fmt.Printf(jp, q+string(10)+jp+q, q+string(10)+gp+q)
}""";
        System.out.printf(gp, q+jp+q, q+gp+q);
    }
}
