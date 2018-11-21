package test1;

import java.util.Arrays;

public class Manager {
	private Staff[] arr = new Staff[6];
	int size = 0;
	public Manager(){
		Staff s1 = new Staff("1", "张三1", '男', "2134124@qq.com", "1234564", "12346548");
		Staff s2 = new Staff("2", "张三2", '男', "2134124@qq.com", "1234564", "12346548");
		Staff s3 = new Staff("3", "张三3", '女', "2134124@qq.com", "1234564", "12346548");
		Staff s4 = new Staff("4", "张三4", '女', "2134124@qq.com", "1234564", "12346548");
		Staff s5 = new Staff("5", "张三5", '男', "2134124@qq.com", "1234564", "12346548");
		Staff s6 = new Staff("6", "张三6", '男', "2134124@qq.com", "1234564", "12346548");
		arr[size++] = s1;
		arr[size++] = s2;
		arr[size++] = s3;
		arr[size++] = s4;
		arr[size++] = s5;
		arr[size++] = s6;
		
	}
	public Staff[] fenye(int no){
		int tage = (no - 1) * 3;
		int end = no * 3;
		int newtage = this.size % 3 == 0 ? this.size / 3 : this.size / 3 + 1;
		if(no > newtage){
			return new Staff[0];
		}
		if(no == newtage){
			if(this.size % 3 == 0){
				end = tage + 3;
			}else{
				end = tage + this.size % 3;
			}
		}
		Staff[] sta = new Staff[end - tage];
		for (int i = tage; i < end; i++) {
			sta[i - tage] = arr[i];
		}
		return sta;
	}
	public boolean add(Staff no){
		Staff o = this.star(no.getNo());
		if(o != null){
			return false;
		}
		this.lei(this.size + 1);
		arr[size++] = no;
		return true;
	}
	private void lei(int num){
		if(num > arr.length){
		this.arr = Arrays.copyOf(arr, this.arr.length + (this.arr.length >> 1));
		}
	}
	public Staff star(String no){
		for (int i = 0; i < this.size; i++) {
			if(arr[i].getNo().equals(no)){
				return arr[i];
			}
		}
		return null;
	}
	public String nannv(){
		int nan = 0;
		int nv = 0;
		for (int i = 0; i < this.size; i++) {
			if(arr[i].getSex() == '男'){
				nan++;
			}
		}
		nv = this.size - nan;
		String str = "男性" + nan + "人，女性" + nv + "人";
		return str;
	}
	public boolean shanchu(String no){
		for (int i = 0; i < this.size; i++) {
			if(arr[i].getNo().equals(no)){
				arr[i] = null;
				System.arraycopy(arr, i+1, arr, i, this.size-i-1);
				this.size--;
				return true;
			}
		}
		return false;
	}
}
