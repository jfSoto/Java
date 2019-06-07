-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3306
-- Tiempo de generación: 26-02-2019 a las 08:58:54
-- Versión del servidor: 5.6.34-log
-- Versión de PHP: 7.2.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `tiendalibros`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `libros`
--

CREATE TABLE `libros` (
  `idLibro` int(11) NOT NULL,
  `tituloLibro` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `autorLibro` varchar(45) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `precioLibro` decimal(10,2) DEFAULT NULL,
  `cantidadLibro` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `libros`
--

INSERT INTO `libros` (`idLibro`, `tituloLibro`, `autorLibro`, `precioLibro`, `cantidadLibro`) VALUES
(1, 'El señor de los anillos', 'J.R.R. Tolkien', 60.00, 10),
(2, 'El capitán Alatriste', 'Arturo Pérez Reverte', 25.00, 20),
(3, 'Harry Potter y La Piedra Filosofal', 'J.K. Rowling', 30.00, 15),
(4, 'Percy Jackson y Los Dioses del Olimpo: El Lad', 'Rick Riordan', 30.00, 20);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedidos`
--

CREATE TABLE `pedidos` (
  `idPedido` int(11) NOT NULL,
  `fechaPedido` date DEFAULT NULL,
  `idUsuarioFK1` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pedidoslibros`
--

CREATE TABLE `pedidoslibros` (
  `idPedidoLibro` int(11) NOT NULL,
  `idLibroFK2` int(11) NOT NULL,
  `idPedidoFK3` int(11) NOT NULL,
  `cantidadPedidoLibro` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `idUsuario` int(11) NOT NULL,
  `nombreUsuario` varchar(16) COLLATE utf8_spanish2_ci DEFAULT NULL,
  `claveUsuario` varchar(41) COLLATE utf8_spanish2_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish2_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`idUsuario`, `nombreUsuario`, `claveUsuario`) VALUES
(1, 'usuario1', '122b738600a0f74f7c331c0ef59bc34c'),
(2, 'usuario2', '2fb6c8d2f3842a5ceaa9bf320e649ff0');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `libros`
--
ALTER TABLE `libros`
  ADD PRIMARY KEY (`idLibro`);

--
-- Indices de la tabla `pedidos`
--
ALTER TABLE `pedidos`
  ADD PRIMARY KEY (`idPedido`),
  ADD KEY `idUsuarioFK1_idx` (`idUsuarioFK1`);

--
-- Indices de la tabla `pedidoslibros`
--
ALTER TABLE `pedidoslibros`
  ADD PRIMARY KEY (`idPedidoLibro`),
  ADD KEY `idLibroFK2_idx` (`idLibroFK2`),
  ADD KEY `idPedidoFK3_idx` (`idPedidoFK3`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`idUsuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `libros`
--
ALTER TABLE `libros`
  MODIFY `idLibro` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
--
-- AUTO_INCREMENT de la tabla `pedidos`
--
ALTER TABLE `pedidos`
  MODIFY `idPedido` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `pedidoslibros`
--
ALTER TABLE `pedidoslibros`
  MODIFY `idPedidoLibro` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `idUsuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `pedidos`
--
ALTER TABLE `pedidos`
  ADD CONSTRAINT `idUsuarioFK1` FOREIGN KEY (`idUsuarioFK1`) REFERENCES `usuarios` (`idUsuario`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `pedidoslibros`
--
ALTER TABLE `pedidoslibros`
  ADD CONSTRAINT `idLibroFK2` FOREIGN KEY (`idLibroFK2`) REFERENCES `libros` (`idLibro`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `idPedidoFK3` FOREIGN KEY (`idPedidoFK3`) REFERENCES `pedidos` (`idPedido`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
