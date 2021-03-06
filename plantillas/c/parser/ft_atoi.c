/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_atoi.c                                          :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: jre-gonz <marvin@42.fr>                    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2021/12/07 17:45:16 by jre-gonz          #+#    #+#             */
/*   Updated: 2021/12/08 15:25:10 by jre-gonz         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */
#define MIN_NUM '0'
#define MAX_NUM '9'

#define SPACES " \n\v\f\r\t"

int	is_space(char c)
{
	unsigned int	i;

	i = 0;
	while (SPACES[i])
		if (c == SPACES[i++])
			return (1);
	return (0);
}

int	is_number(char c)
{
	return (c >= MIN_NUM && c <= MAX_NUM);
}

int	ft_atoi(char *str)
{
	int	number;
	int	i;
	int	sign;

	i = 0;
	sign = 1;
	number = 0;
	while (is_space(str[i]))
		i++;
	while (str[i] == '-' || str[i] == '+')
		if (str[i++] == '-')
			sign *= -1;
	while (is_number(str[i]))
	{
		number *= 10;
		number += (str[i++] - 48);
	}
	return (sign * number);
}
