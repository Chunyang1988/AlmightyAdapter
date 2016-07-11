# AlmightyAdapter

简化Adapter方法，让Adapter更加好的管理。

让Item只管理自己的View

让getView管理逻辑转换


###AlmightyAdapter<T> 抽象类

	public abstract AlmightyItem createItem(int position);

	public abstract T getViewData(int position);
	
	
两个抽象方法
	
createItem，创建ItemView，管理自己View
	
getViewData 转化数据，赋值给Item让Item更新数据
	

###AlmightyItem<T> 接口
	
	public View bindViews(LayoutInflater inflater, ViewGroup root);

  	public void getViewData(T data);
	
bindViews，创建View，并绑定控件
	
getViewData，让自己更新数据使用



##使用

自定义Adapter集成AlmightAdapter，完成相应抽象方法

自定义相应ItemView添加AlmightyItem接口

详见请看demo
	
	
 
 
