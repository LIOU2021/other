import javax.swing.JOptionPane;

public class ��w�ƧǪk2 {

	public static void main(String[] args) {
		int run = 5;//�ݭn�ƦC�X�ӡA�]�N�O���ϥΪ̿�J�X�ӼƦr
		int runCount=1;
		
		int[] arr = new int[run];
		
		System.out.println("��X�ϥΪ̿�J���Ʀr:");
		while(runCount<=run) {
			String str = JOptionPane.showInputDialog("��J�Ʀr");
			arr[runCount-1]=Integer.parseInt(str);
			runCount+=1;
		}
		
		for (int i=0 ; i < arr.length ; i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println();
		
		System.out.println("�Ѥj��p�ƦC:");
		for(int i =0 ; i<(arr.length-1) ; i++ ) {
			for(int j=0;j<(arr.length-1-i);j++) {
				if(arr[j]<arr[j+1]) {
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
		
		for (int i=0 ; i < arr.length ; i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println();
		
		
		System.out.println("�Ѥp��j�ƦC:");
		for(int i =0 ; i<(arr.length-1) ; i++ ) {
			for(int j=0;j<(arr.length-1-i);j++) {
				if(arr[j]>arr[j+1]) {
					int tmp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=tmp;
				}
			}
		}
		
		for (int i=0 ; i < arr.length ; i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println();
		
	}

}
