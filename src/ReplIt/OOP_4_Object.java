package ReplIt;

public class OOP_4_Object {
		private int x,y,result;

		

		public void setX(int x) {
			this.x = x;
		}

		public void setY(int y) {
			this.y = y;
		}

		public int getResult() {
			return result;
		}

		void plus() {
			result = x+y;
			System.out.println(result);;
		}
		
		void minus() {
			result = x-y;
			System.out.println(result);
		}
}
