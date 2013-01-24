%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%% Invoked by calling either methods in the interpreter %%
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%


software_co(Name) :-
	company(Name, software).
	
payroll(Comp, Sum) :-
	staff(Comp, AllStaff),       	 %Generates a list of staff at Comp
	compareSum(AllStaff, Sum, 0).    %Calls compareSum

compareSum([], Sum, Total):-
	Sum == Total.			 %Make Comparision and return true or false.
compareSum([_|T], Sum, Total):-
	Temp is Total + 1,		 %Everytime an element is found, add one to the total employees
	compareSum(T, Sum, Temp).	 %Call compareSum again, with new Total and progressed list.
