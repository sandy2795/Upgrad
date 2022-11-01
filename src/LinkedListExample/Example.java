package LinkedListExample;
import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

class Example{

	public static void main(String[] args) {
		List<Float> random = new ArrayList<Float>();
		random.add(2f);
		random.add(4f);
		random.add(5f);
		random.add(10f);
		random.add(99.9f);    
		random.add(101f);

		iterateAltn(random);
	}

	public static void iterateAltn(List<Float> num) {
		ListIterator<Float> it = num.listIterator();
			while(it.hasNext())	{
				if(it.nextIndex() % 2!=0) {
					System.out.println(it.nextIndex()+"-if-"+it.next());
				//	System.out.println(it.next());
				}
				else {
					//continue;
					System.out.println(it.nextIndex()+"-else-"+it.next());
				}
			}
		}
	}
