package Week07_example;

public class Button {
	private String caption;
	private OnClickListener listener;

	public Button(String caption) {
		super();
		this.setCaption(caption);
	}

	static interface OnClickListener{ //버튼을 사용하려고하면 이 인터페이스를 구현해야
		void onClick();
	}

	public void setListener(OnClickListener listener) {
		this.listener = listener;
	}
 
	public void touch() {
		if(this.listener != null) {
			this.listener.onClick();
		}
	}

	public void setCaption(String caption) {
		this.caption = caption;
	}
}
