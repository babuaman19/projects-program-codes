package mentoring;
//Interface declaration: by first user  
public interface course {
	void draw();  //void draw()-public abstract void draw()(abstract method)
	//abstraction
	}   
//Implementation: by second user
	class streams implements course{  
	public void draw(){System.out.println("Information about different streams-");}  
	}  
   class science extends streams{  
	public void draw(){System.out.println("\n");
		  System.out.println("->Science stream");
	      System.out.println(" This stream, students have to study Physics, Chemistry and English as the mandatory subjects whereas out of Biology and"
			+ "\n"
			+ " Mathematics, they can choose one according to their interest and career plans." 
			+ "\n"
			+ "Students having Mathematics (for PCM) can further apply for engineering courses(BTech/BE) or B. Sc in any of the Science subjects except Biology."
			+ "\n"
			+ "However the students opting for Science stream with Biology, i.e., PCB can either go for Medical Professional Courses (M.B.B.S, B.A.M.S or B.H.M.S) "
			+ "\n"
			+ "or can opt for B. Sc in Biology or Chemistry. "
			+ "\n"
			+ "In addition the other options are Pharmacy.");
	      }  
	}
	class commerce extends streams{                                                                                 //Hierarchical inheritance
	public void draw(){System.out.println("\n");
		System.out.println("->Commerce stream");
	    System.out.println("This stream also provides a wide array of career opportunities. Two subjects are the building blocks of this stream i.e."
			+ "\n"
			+ " Business Studies and Accountancy which every student has to study "
			+ "\n"
			+ "and other two subjects are optional which students can choose from Math, Statistics, Economics, History, Geography, Political Science, etc."
			+ "\n"
			+ " however different schools offer different optional subjects.");
	     }                                                                                                                 //method overriding
	}
	class arts extends streams{  
	public void draw(){System.out.println("\n");
		System.out.println("->Arts stream");
	    System.out.println("Choosing the arts/Humanities stream after Class 10 would enable a student to choose a career"
			+ "\n"
			+ " from a range spanning a wide area. Subjects that are available for study in the CBSE class 11 syllabus are History, Geography, "
			+ "\n"
			+ "Political Science, Psychology, Sociology, English, Hindi and Sanskrit.");
	    } 
	}
	class extras extends streams{  
		public void draw(){System.out.println("\n");
			System.out.println(" ->Vocational/professional courses");
		    System.out.println("These are employment centric courses specially designed for the students who cannot afford further education expenses"
				+ "\n"
				+ " as these courses require fewer expenses and can be accomplished in less time period.");
		    System.out.println("Industrial Training Institute"
				+ "\n"
				+ "Vocational Courses"
				+ "\n"
				+ "Polytechnic Diploma courses"
				+ "\n"
				+ " Paramedical Courses"
				+ "\n"
				+ " Short-term Courses");
		}  
	}
	
	
