//package obj.exception;
//
//import java.io.IOException;
//import java.sql.SQLException;
//
//public class Child extends Parent {
//	
//	public static void main(String[] args) {
//		public void doIt() throws SQLException {
//			//부모가 throws 하지 않은 exception은 throws 할수 없다
//			System.out.println("Child.doIt");
//			try {
//				super.doIt();
//			} catch (IOException e) {
//				throw new SQLException(e.getMessage());
//			}
//		}
//
//	}
//
//}
