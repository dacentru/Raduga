-- phpMyAdmin SQL Dump
-- version 4.3.2
-- http://www.phpmyadmin.net
--
-- Хост: localhost
-- Время создания: Янв 30 2015 г., 16:30
-- Версия сервера: 5.6.16-enterprise-commercial-advanced
-- Версия PHP: 5.5.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- База данных: `raduga`
--

-- --------------------------------------------------------

--
-- Структура таблицы `registry`
--

CREATE TABLE IF NOT EXISTS `registry` (
  `id` int(11) NOT NULL,
  `client` varchar(45) DEFAULT NULL,
  `object` varchar(45) DEFAULT NULL,
  `contract` varchar(45) DEFAULT NULL,
  `nomination` varchar(45) DEFAULT NULL,
  `size` varchar(45) DEFAULT NULL,
  `contact_inside` varchar(45) DEFAULT NULL,
  `contact_outside` varchar(45) DEFAULT NULL,
  `date_start` varchar(45) DEFAULT NULL,
  `date_end` varchar(45) DEFAULT NULL,
  `date_confirmation` varchar(45) DEFAULT NULL,
  `price` varchar(45) DEFAULT NULL,
  `note` varchar(45) DEFAULT NULL,
  `payment` varchar(45) DEFAULT NULL,
  `debt` varchar(45) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `registry`
--

INSERT INTO `registry` (`id`, `client`, `object`, `contract`, `nomination`, `size`, `contact_inside`, `contact_outside`, `date_start`, `date_end`, `date_confirmation`, `price`, `note`, `payment`, `debt`) VALUES
(1, 'OOO TRAST', 'true', 'Договор номер 3424.54 от 12,01,2015', '', '', '', '', '', '', '', '', '', '', ''),
(3, 'ООО "Строй Минус"', 'г. Москва ул. Колошменко', '0000001', 'Демонтаж, установка, отливы, откосы.', '3,500 м2', '', '', '', '', '', '', '', '', ''),
(4, 'Виктор ', 'г Москва Академическая 45', '345', 'уборка вставка демонтаж вывоз мусора ', '5000', '', '89091622902 Виктор', '', '', '', '', '', '', ''),
(9, 'Юрий', 'г. Москва ул. Бориса Жигуленкова 21а', '54224', 'Замена окон', '60000 м2', '89684042199 Юрий Дзик', '89654087741 Юрий Репин', '30,01,2015', '15,02,2015', '', '1500000', 'Проверка', '0', '1500000');

-- --------------------------------------------------------

--
-- Структура таблицы `timestamps`
--

CREATE TABLE IF NOT EXISTS `timestamps` (
  `registry_id` int(8) NOT NULL,
  `update_user_id` int(8) DEFAULT NULL,
  `create_user_id` int(8) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `update_time` timestamp NULL DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Структура таблицы `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `id` int(8) NOT NULL,
  `username` varchar(32) NOT NULL,
  `password` varchar(32) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `patronymic_name` varchar(45) DEFAULT NULL
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Дамп данных таблицы `users`
--

INSERT INTO `users` (`id`, `username`, `password`, `email`, `create_time`, `first_name`, `last_name`, `patronymic_name`) VALUES
(1, 'kot', '12345678', 'dacent.ru@mail.ru', '2015-01-22 14:49:28', 'Виктор', 'Кошенков', 'Владимирович');

--
-- Индексы сохранённых таблиц
--

--
-- Индексы таблицы `registry`
--
ALTER TABLE `registry`
  ADD PRIMARY KEY (`id`);

--
-- Индексы таблицы `timestamps`
--
ALTER TABLE `timestamps`
  ADD PRIMARY KEY (`registry_id`);

--
-- Индексы таблицы `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT для сохранённых таблиц
--

--
-- AUTO_INCREMENT для таблицы `registry`
--
ALTER TABLE `registry`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=12;
--
-- AUTO_INCREMENT для таблицы `users`
--
ALTER TABLE `users`
  MODIFY `id` int(8) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
