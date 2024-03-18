package quiz;
//
import java.util.Arrays;
//
public class Quiz_shop_240315 {
//

    public static void main(String[] args) {
    	
    }}
//        // Test
//        Buyer b1 = new Buyer();
//        b1.cash = 500000;
//        b1.addToCart(new Coffee(10000, "이디야 원두"));
//        b1.addToCart(new Coffee(15000, "커피빈 원두"));
//        b1.addToCart(new Coffee(20000, "스타벅스 원두"));
//        b1.addToCart(new Coffee(10000, "이디야 원두"));
//        b1.addToCart(new Coffee(15000, "커피빈 원두"));
//        b1.addToCart(new Coffee(20000, "스타벅스 원두"));
//        b1.addToCart(new Coffee(10000, "이디야 원두"));
//        b1.addToCart(new Coffee(15000, "커피빈 원두"));
//        b1.addToCart(new Coffee(20000, "스타벅스 원두"));
//        b1.addToCart(new Coffee(10000, "이디야 원두"));
//        b1.addToCart(new Coffee(15000, "커피빈 원두"));
//        b1.addToCart(new Coffee(20000, "스타벅스 원두"));
//        b1.addToCart(new Coffee(10000, "이디야 원두"));
//        b1.addToCart(new Coffee(15000, "커피빈 원두"));
//        b1.addToCart(new Coffee(20000, "스타벅스 원두"));
//        b1.addToCart(new Coffee(10000, "이디야 원두"));
//        b1.addToCart(new Coffee(15000, "커피빈 원두"));
//        b1.addToCart(new Coffee(20000, "스타벅스 원두"));
//        b1.addToCart(new Vaccine(69000, "V3"));
//        
//        b1.buyAll();
//        System.out.println("============= 카트 정보 ================");
//        b1.viewCart();
//        System.out.println("============= 트렁크 정보 ==============");
//        b1.viewTrunk();
//        b1.addToCart(new Coffee(15000, "커피빈 원두"));
//        b1.buyAll();
//        
//        b1.receipt();
//        
//        for (int i = 0; i < b1.t_index; i++) {
//            Product p = b1.trunk[i];
//            
//            if (p instanceof Vaccine) {
//                Vaccine v = (Vaccine)p;
//                v.checkComputer();
//            } else if (p instanceof Coffee) {
//                Coffee c = (Coffee)p;
//                c.drink();                      
//            } else {
//                
//            }
//            
//        }
//    }
//
//}
//
//class Buyer {
//    public int cash;
//    public Product[] cart = new Product[10];
//    public Product[] trunk = new Product[10];
//    public int c_index = 0; // 장바구니 인덱스
//    public int t_index = 0; // 트렁크 인덱스
//
//    public void buy(Product p) {
//        if (cash >= p.getPrice()) {
//            cash -= p.getPrice();
//            trunk[t_index++] = p;
//        } else {
//            System.out.println("잔액이 부족합니다.");
//        }
//    }
//
//    public void buyAll() {
//        for (int i = 0; i < c_index; i++) {
//            buy(cart[i]);
//        }
//        Arrays.fill(cart, null); // 장바구니 비우기
//        c_index = 0;
//    }
//
//    public void addToCart(Product p) {
//        if (c_index >= cart.length) {
//            cart = Arrays.copyOf(cart, cart.length * 2); // 장바구니 크기 2배로 확장
//        }
//        cart[c_index++] = p;
//    }
//
//    public void cancel(int cart_index) {
//        if (cart_index >= 0 && cart_index < c_index) {
//            Product removedProduct = cart[cart_index];
//            cart[cart_index] = null;
//            System.out.println(removedProduct.getName() + "을(를) 장바구니에서 제거했습니다.");
//        } else {
//            System.out.println("유효하지 않은 인덱스입니다.");
//        }
//    }
//
//    public void receipt() {
//        System.out.println("============= 영수증 ==============");
//        for (int i = 0; i < t_index; i++) {
//            System.out.println(trunk[i].getName() + " : " + trunk[i].getPrice());
//        }
//        System.out.println("남은 현금: " + cash);
//    }
//
//    public void viewCart() {
//        System.out.println("============= 장바구니 ==============");
//        for (int i = 0; i < c_index; i++) {
//            System.out.println(cart[i].getName() + " : " + cart[i].getPrice());
//        }
//    }
//
//    public void viewTrunk() {
//        System.out.println("============= 트렁크 ==============");
//        for (int i = 0; i < t_index; i++) {
//            System.out.println(trunk[i].getName() + " : " + trunk[i].getPrice());
//        }
//    }
//}
//
//class Product {
//    private String name;
//    private int price;
//
//    public Product(int price, String name) {
//        this.price = price;
//        this.name = name;
//    } 
//
//    public String getName() {
//        return name;
//    }
//
//    public int getPrice() {
//        return price;
//    }
//}
//
//class Coffee extends Product {
//    public Coffee(int price, String name) {
//        super(price, name);
//    }
//
//    public void drink() {
//        System.out.println(getName() + "를 마십니다.");
//    }
//}
//
//class Vaccine extends Product {
//    public Vaccine(int price, String name) {
//        super(price, name);
//    }
//
//    public void checkComputer() {
//        System.out.println(getName() + "를 컴퓨터로 확인합니다.");
//    }
//}
