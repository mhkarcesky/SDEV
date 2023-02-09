 public class Box {
    
     private int size;
     private String contents;
     private static char sym = '*';
    
     public Box() {
     size = 4;
     contents = "";
     }
    
     public Box(int size, String contents) {
     this.size = size;
     this.contents = contents;
     fixSize();
 }
    
     public int getSize() {
     return size;
      }
    
     public String getContents() {
     return contents;
     }
    
     public void setSize(int size) {
     this.size = size;
     fixSize();
     }
    
     public void setContents(String contents) {
     this.contents = contents;
     fixSize();
     }
    
     private void fixSize() {
     int actual = contents.length() + 4;
     this.size = Math.max(actual, this.size);
     }
    
     @Override
    42 public String toString() {
    43 String theSym = Character.toString(Box.sym);
    44 String out = "";
    45 for (int i = 0; i < this.size; i++)
    46 out += theSym;
    47 out += "\n";
    48 out += theSym + " " + this.contents + " ";
    49 int spaces = this.size - this.contents.length() - 4;
    50 for (int i = 0; i < spaces; i++)
    51 out += " ";
     out += theSym + "\n";
     for (int i = 0; i < this.size; i++)
     out += theSym;
     return out;
     }
    
    58 @Override
    Fred Portier CMSCI 256 Notes C A Java Class Spring 2023 2 / 16
    59 public boolean equals(Object obj) {
    60 Box b2 = (Box) obj;
    61 if (this.contents.equals(b2.contents))
    62 return true;
    63 else
    64 return false;
    65 }
    66
    67 public static void setSymbol(char s) {
    68 Box.sym = s;
    69 }
    70 }