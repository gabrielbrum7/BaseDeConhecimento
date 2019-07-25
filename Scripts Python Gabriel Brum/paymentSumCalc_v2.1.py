#coding: utf8

print '\n\n'
print 'paymentSumCalc\n\n'

print 'Para cada entrega você terá que registrar os dados que se seguirão para alterar o XML\n\n'

loop = input ('Digite a quantidade de entregas: \n')

for item in range (0, loop):

	print 'Registro da ' + str(item + 1) + 'ª entrega: \n'

	amountDue = input ('Digite o amountDue: ')
	totalAmount = input ('Digite o totalAmount: ')
	salePrice = input ('Digite o salePrice: ')
	print '\n'

	difference = 0

	difference = ((totalAmount - amountDue) - salePrice)

	print 'Dados para alterar a ' + str(item + 1) + 'ª entrega: \n'
	print '1º Substitua o totalAmount atual pelo valor: ' + '(' + str(amountDue) + ')'
	print '2º Substitua o salePrice e/ou o chargedAmount (coniventemente e/ou distributivamente, de modo que não fique valor negativo para cada um dos campos) atual pelo valor: ' + '(' + str(difference * -1) + ')\n\n'

print ('Agora realize os reajustes e veja se o XML está de acordo com o script que calcula a divergência valor.')
print '\n\n'