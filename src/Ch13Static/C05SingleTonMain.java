package Ch13Static;

class Product
{
	String PName;
	int amount;
	//모든 인자를 받아 저장하는 생성자를 만듭니다.
	public Product(String pName, int amount) {
		PName = pName;
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Product [PName=" + PName + ", amount=" + amount + "]";
	}
	
	
	
}
class Refrigerator
{
	//싱글톤 패턴 처리합니다.
	private static Refrigerator instance;
	public static Refrigerator getInstance() {
		if(instance == null) {
			instance = new Refrigerator();
		}
		return instance;
		
	}
	Product [] list = new Product[100];
	int ProductNum = 0;
	void SetProduct(Product product) {
		if(ProductNum<=99)
		{
		//list  ProductNum번째 idx에 외부에서 생성된 Product가 연결
		//ProductNum의 count 1증가
		list[ProductNum] = product;
		ProductNum++;
		}
		else
		{
			System.out.println("더이상 담을 수 있는 공간이 없습니다..");
		}
	}
	Product GetProduct(String search,int amount) {
		
		//반복문과 문자열 검색 처리를 통해서 list에 저장된 search 
		//객체 꺼내와서 요청 개수만큼 차감
		//찾은 Product의 주소를 리턴
		
		// 로직
		// 만약 제품이 검색 안된다면 null 리턴
		// 만약 제품이 검색 되고 수량이 저장된 수량을 초과한다면 null 리턴
		// 만약 제품이 검색 되고 수량이 저장된 수량보다 작다면
		//-Product 객체를 따로 만들어 수량 분배하여 리턴
		// 만약 제품이 검색되고 수량이 저장된 수량과 같다면 list안의 내용물 삭제 후
		// 제품 리턴
		for(Product product : list)
		{
			if(search.equals(product.PName))
			{
				// 일치하는 제품이 있다면
				if(product.amount < amount) // 요청 수량이 더 많을시
					return null;
				else if(product.amount == amount){ // 요청 수량 일치시
					product = null;
					return product;
				}
				else { // 저장된 제품이 더 많을 시
				product.amount -= amount;
				return new Product(search,amount);
				}
			}
			
		}
		// 일치하는 제품이 없다
		return null;
	}
}
public class C05SingleTonMain {

	public static void main(String[] args) {
		
		
		//냉장고 객체 가져오기(싱글톤 패턴)
		Refrigerator refrigerator= Refrigerator.getInstance();
		
		//상품정보객체 생성 
		Product prod = new Product("콜라",5);
		
		//냉장고에 상품저장
		refrigerator.SetProduct(prod);

		//냉장고에 상품반환
		Product prod1 = refrigerator.GetProduct("사이다",1); 
				
		System.out.println("get Item : " + prod1.toString());
				
	}

}
