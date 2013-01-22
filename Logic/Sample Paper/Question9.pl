%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
%% Invoked by calling 'main' in the interpreter %%
%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%%
main :-
    open('data.nums', read, Input), % Open file source.
    read(Input, ToSquare),          % Store first line into ToSquare
    close(Input),                   % Close source
    X is ToSquare*ToSquare,         % Preform square
    write(X).                       % Write to standard output
