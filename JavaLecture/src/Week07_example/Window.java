package Week07_example;

import Week07_example.Button.OnClickListener;

public class Window implements OnClickListener{
	Button callBtn = new Button("전화");
	Button callBtn2 = new Button("전화");
	Button msgBtn = new Button("메세지");
	
	CallListener calllistener = new CallListener();
	
	public Window() {
		super();
		this.callBtn.setListener(calllistener); // call 이거 처럼 반복적으로 사용하게 되면 따로 리스너를 만들어서 사용하는 것이 효율적이고 
		this.callBtn2.setListener(calllistener);
		this.msgBtn.setListener(new OnClickListener() {//한번만 사용할거면 이렇게 쓰는것이 효율적이다.
			
			//인터페이스의 익명객체를 만드는 법
			@Override
			public void onClick() {
				// TODO Auto-generated method stub
				System.out.println("메세지를 보냅니다.");
			}
			
		});
	}


	@Override
	public void onClick() {
		// TODO Auto-generated method stub
		System.out.println("버튼이 클릭됨");
	}
	
}
