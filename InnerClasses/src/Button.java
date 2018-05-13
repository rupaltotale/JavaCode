

/**
 * Created by dev on 4/10/2015.
 */
public class Button {
    private String title;
//    instance variable
    private OnClickListener onClickLister;
//    instance variable of type someInterface

    public Button(String title) {
        this.title = title;
    }
//    constructor

    public String getTitle() {
        return title;
    }
//    getter

    public void setOnClickListener(OnClickListener onClickListener) {
        this.onClickLister = onClickListener;
    }
//    setter

    public void onClick() {
        this.onClickLister.onClick(this.title);
    }
//    method called onClick that calls itself
    

    public interface OnClickListener {
        public void onClick(String title);
    }
//    inner interface

}
