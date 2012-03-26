%    checks the board if it has any
%    two queens which can attack each other
%    the board data structure is as follows
%    board = [(1,q1),(2,q2),(3,q3),(4,q4),...],
%    the queen position is indicated in each cell,
%    an empty board has its queens positions
%    initialized as -1 which means not known


mem(_,[]):-!,fail.
mem(X,[X|_]):-!.
mem(X,[_|L]):-mem(X,L).

isaset([]):-!.
isaset([H|T]):-
	not(mem(H,T)),isaset(T).

% safeX([(X,_)|Qs]):- not(mem((X,_),Qs)),!,safeX(Qs).
% safeX([]).

% safeY([(_,Y)|Qs]):- not(mem((_,Y),Qs)),!, safeY(Qs).
% safeY([]).

square((X,Y),(X,Y)):-!,fail.
square((X1,Y1),(X2,Y2)):-
	D1 is abs(Y1-Y2),
	D2 is abs(X1-X2),
	D1 =:= D2.

safeD([]):-!.
safeD([_]):-!.

safeD([Q1,Q2|_]):-
  square(Q1,Q2),fail,!.

safeD([Q1|Qs]):-
  mem(Q2,Qs),
  square(Q1,Q2),fail,!.

safeD([Q1|Qs]):-
  mem(Q2,Qs),
  not(square(Q1,Q2)),
  safeD(Qs).

merge_tupples([X|Xs],[Y|Ys],[(X,Y)|R]):-
    merge_tupples(Xs,Ys,R),!.
merge_tupples([],_,[]).
merge_tupples(_,[],[]).

solve(B,N):-
  numlist(1,N,NL),
  permutation(NL,P),
  merge_tupples(NL,P,B),safeD(B),!.
  
del(X, [X|T], T).
del(X, [H|T], [H|S]):-
del(X, T, S).

permutation([], []).
permutation([H|T], R):-
	permutation(T, X), del(H, R, X).