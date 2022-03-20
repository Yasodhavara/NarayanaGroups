givenlist=[1,2,4,6,3,8,3,9,10]
sortedlist=[]
listindex=[]
for element in givenlist:
    sortedlist=sortedlist+[element]
#sortedlist.sort()
for i in range(len(sortedlist)):
    for j in range(i+1,len(sortedlist)):
        if sortedlist[i]>sortedlist[j]:
            sortedlist[i],sortedlist[j]=sortedlist[j],sortedlist[i];
print(sortedlist)
            
for element in range(0,len(givenlist)):
    if(givenlist[element]!=sortedlist[element]):
        listindex.append(element)
if(len(listindex)==0):
    print(-1,-1)
else:
    print(listindex[0],listindex[-1])
