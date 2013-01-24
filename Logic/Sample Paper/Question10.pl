%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%% Invoked by calling either methods in the interpreter %%
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%


software_co(Name) :-
	company(Name, software).
	
payroll(Comp, Sum) :-
	staff(Comp, AllStaff),        %Generates a list of staff at Comp
	getSum(AllStaff, Compare),    %Calls getSum method and stores into Compare
	Compare == Sum.               %Preforms a compare between variables Compare and Sum
	
getSum([], _).                        %Stop method if list is empty.

getSum([H|T], X) :-
	H(_,_,Salery),                %I'm 99% sure this line is wrong but I don't know how to write it
	Y is X,                       %Set Y as X
	X is Salery+Y,                %Set X as H plus Y
	getSum(T, X).                 %Invoke getSum, passing in new X.
