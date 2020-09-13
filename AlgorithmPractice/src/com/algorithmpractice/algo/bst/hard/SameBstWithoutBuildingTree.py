def sameBsts(arrayOne, arrayTwo):
	if len(arrayOne) != len(arrayTwo):
		return False

	if len(arrayOne) == 0 and len(arrayTwo) == 0:
		return True

	if arrayOne[0] != arrayTwo[0]:
		return False

	smaller1 = []
	smaller2 = []
	larger1 = []
	larger2 = []

	for i in range(1, len(arrayOne)):
		if(arrayOne[i] < arrayOne[0]):
			smaller1.append(arrayOne[i])
		else:
			larger1.append(arrayOne[i])

		if(arrayTwo[i] < arrayTwo[0]):
			smaller2.append(arrayTwo[i])
		else:
			larger2.append(arrayTwo[i])

	return sameBsts(smaller1, smaller2) and sameBsts(larger1, larger2)