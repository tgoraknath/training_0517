package trainer_oops.oops;


/* Access specifiers : they specify the access of a variable. 
}
	 Static: when something is declared to be static it remains the same in all the other instances when it is changed in one instance
	 Final: It cannot be changed once declared.
	 
	   Access modifiers: 
	   Public: They can be accessed anywhere.
	   private: It is accessible only inside the particular class.
	   Protected: It makes the variables accessible everywhere inside a package. and in a subclass outside the package.
	   default/package: It is only allowed to be used within the package.
	   	   
	   */
	
	class B{
		
		
		private void stmt() {
			System.out.println("hello");
				 	}
		public void number() {
		int a = 10;
		System.out.println(a++);
				
		}
					
		
		protected void letter() {
			System.out.println("hello");
			
		}
		}
	
	class Notes
	{	public static void main(){
			B obj = new B();
			obj.stmt(); // shows an error since the variable is declared to be private and cannot be accessed
			obj.number();// Does'nt show error as it is declared public and can be used outside the class.
		    obj.letter();// can be used in different class from same package.
			
		}
	}
	/* git commands:
	 1. git : to check if the git is responding . It gives the details about version, path etc. and displays some git commands.
	 2.  git clone link :  (it helps to download/clone the files in the repository.
	 3. git status : tells the status of the files associated with the git.
	 4. git add modified/ untracked file address: to  add the files to be committed
	 5. git remote -v : shows all the details about origin and upstream 
	 6. git remote add upstream : add the changes to the upstream repository.
	 7. git commit -m : adds up a message when committing on the head but not yet to the repository.
	 8. git config --global user.email "sreenavya9999@gmail.com": add the email.(authentication)
	 9. git config --global user.name "sreenavya9: 
	 10. git push origin master : pushed the changes to the repository 
	 
	 */
	
	
	


