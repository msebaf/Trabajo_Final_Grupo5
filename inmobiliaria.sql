-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 06-07-2022 a las 04:14:07
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `inmobiliaria`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `contratoalquiler`
--

CREATE TABLE `contratoalquiler` (
  `idContrato` int(11) NOT NULL,
  `codContrato` varchar(50) DEFAULT NULL,
  `vendedor` varchar(50) NOT NULL,
  `idPropiedad` int(11) NOT NULL,
  `idInquilino` int(11) NOT NULL,
  `fecha_Inicio` date NOT NULL,
  `fecha_Final` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `contratoalquiler`
--

INSERT INTO `contratoalquiler` (`idContrato`, `codContrato`, `vendedor`, `idPropiedad`, `idInquilino`, `fecha_Inicio`, `fecha_Final`) VALUES
(8, 'C08', 'Jhony', 33, 3, '2018-10-30', '1955-01-01'),
(9, 'C09', 'Jhony', 34, 3, '2018-10-30', '2020-10-30'),
(10, 'C010', 'Jhony', 35, 3, '2018-10-30', '2010-10-06'),
(11, 'C011', 'Jhony', 36, 3, '2018-10-30', '2010-10-12'),
(12, 'C012', 'Jhony', 37, 3, '2018-10-30', '2020-10-30'),
(13, 'C013', 'Jhony', 38, 3, '2018-10-30', '2010-10-01'),
(14, 'C014', 'Jhony', 39, 3, '2018-10-30', '2020-10-30'),
(15, 'C015', 'Jhony', 40, 3, '2018-10-30', '2020-10-30'),
(16, 'C016', 'Jhony', 41, 3, '2018-10-30', '2020-10-30'),
(17, 'C017', 'Jhony', 42, 3, '2018-10-30', '2010-10-07'),
(18, 'C018', 'Jhony', 41, 3, '2018-10-30', '2020-10-30'),
(19, 'C019', 'Jhony', 41, 3, '2018-10-30', '2020-10-30'),
(20, 'C020', 'Jhony', 45, 3, '2018-10-30', '2020-10-30'),
(21, 'C021', 'Jhony', 46, 3, '2018-10-30', '2020-10-30'),
(22, 'C022', 'Jhony', 47, 3, '2018-10-30', '2020-10-30'),
(23, 'C023', 'Jhony', 48, 3, '2018-10-30', '2020-10-30'),
(24, 'C024', 'Jhony', 49, 3, '2018-10-30', '2020-10-30');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inquilino`
--

CREATE TABLE `inquilino` (
  `idInquilino` int(11) NOT NULL,
  `dni` int(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `cuit` int(50) NOT NULL,
  `telefono` int(50) NOT NULL,
  `trabajo` varchar(50) NOT NULL,
  `apellidoGarante` varchar(50) NOT NULL,
  `nombreGarante` varchar(50) NOT NULL,
  `dniGarante` int(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `inquilino`
--

INSERT INTO `inquilino` (`idInquilino`, `dni`, `apellido`, `nombre`, `cuit`, `telefono`, `trabajo`, `apellidoGarante`, `nombreGarante`, `dniGarante`) VALUES
(3, 3214321, 'Brandoni', 'carlos', 123213, 23213, 'rtre', 'rere', 'werew', 2143213),
(4, 232321, 'perez', 'cacho', 234343545, 13213, 'pintor', 'dsfdsf', 'gfgf', 234545),
(5, 34343, 'hghgf', 'fgfd', 23343434, 45435, 'pintor', 'dfdf', 'frrrr', 435435),
(6, 2343, 'dsfds', 'fdsf', 2323432, 3432, 'dfds', 'dsfsd', 'dfds', 3423),
(7, 7687, 'paco', 'hhhh', 44447687, 67567, 'hghjg', 'hguy', 'high', 54564);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `propiedad_inmueble`
--

CREATE TABLE `propiedad_inmueble` (
  `idPropiedad` int(11) NOT NULL,
  `codigo` varchar(15) DEFAULT NULL,
  `direccion` varchar(50) NOT NULL,
  `zona` varchar(50) NOT NULL,
  `tipo` varchar(50) NOT NULL,
  `superficie` double NOT NULL,
  `precio` double NOT NULL,
  `idPropietario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `propiedad_inmueble`
--

INSERT INTO `propiedad_inmueble` (`idPropiedad`, `codigo`, `direccion`, `zona`, `tipo`, `superficie`, `precio`, `idPropietario`) VALUES
(27, 'v54', 'ewr', 'wer', 'ewrw', 34, 34, 5),
(28, 'C28', 'Algo', 'Sur', 'C', 23.5, 345.5, 5),
(29, 'C29', 'Algo', 'Sur', 'C', 23.5, 345.5, 5),
(30, 'C30', 'Algo', 'Sur', 'C', 23.5, 345.5, 5),
(31, 'C31', 'Algo', 'Sur', 'C', 23.5, 345.5, 5),
(32, 'C32', 'Algo', 'Sur', 'C', 23.5, 345.5, 5),
(33, 'C33', 'Algo', 'Sur', 'C', 23.5, 345.5, 5),
(34, 'C34', 'Algo', 'Sur', 'C', 23.5, 345.5, 5),
(35, 'C35', 'Algo', 'Sur', 'C', 23.5, 345.5, 5),
(36, 'C36', 'Algo', 'Sur', 'C', 23.5, 345.5, 5),
(37, 'C37', 'Algo', 'Sur', 'C', 23.5, 345.5, 5),
(38, 'C38', 'Algo', 'Sur', 'C', 23.5, 345.5, 5),
(39, 'C39', 'Algo', 'Sur', 'C', 23.5, 345.5, 5),
(40, 'C40', 'Algo', 'Sur', 'C', 23.5, 345.5, 5),
(41, 'C41', 'Algo', 'Sur', 'C', 23.5, 345.5, 5),
(42, 'C42', 'Algo', 'Sur', 'C', 23.5, 345.5, 5),
(43, 'C43', 'Algo', 'Sur', 'C', 23.5, 345.5, 5),
(44, 'C44', 'Algo', 'Sur', 'C', 23.5, 345.5, 5),
(45, 'C45', 'Algo', 'Sur', 'C', 23.5, 345.5, 5),
(46, 'C46', 'Algo', 'Sur', 'C', 23.5, 345.5, 5),
(47, 'C47', 'Algo', 'Sur', 'C', 23.5, 345.5, 5),
(48, 'C48', 'Algo', 'Sur', 'C', 23.5, 345.5, 5),
(49, 'C49', 'Algo', 'Sur', 'C', 23.5, 345.5, 5),
(50, 'C50', 'Algo', 'Sur', 'C', 23.5, 345.5, 5),
(51, 'C51', 'Algo', 'Sur', 'C', 23.5, 345.5, 5),
(52, 'C52', 'Algo', 'Sur', 'C', 23.5, 345.5, 5),
(53, 'C53', 'Algo', 'Sur', 'C', 23.5, 345.5, 5),
(54, 'C54', 'Algo', 'Sur', 'C', 23.5, 345.5, 5),
(55, 'C55', 'Algo', 'Sur', 'C', 23.5, 345.5, 5),
(56, 'C56', 'Algo', 'Sur', 'C', 23.5, 345.5, 5),
(57, 'C57', 'Algo', 'Sur', 'C', 23.5, 345.5, 5),
(58, 'C58', 'Algo', 'Sur', 'C', 23.5, 345.5, 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `propietario`
--

CREATE TABLE `propietario` (
  `idPropietario` int(11) NOT NULL,
  `DNI` int(11) NOT NULL,
  `telefono` int(11) NOT NULL,
  `apellidoPropietario` varchar(50) NOT NULL,
  `nombrePropietario` varchar(50) NOT NULL,
  `domicilio` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `propietario`
--

INSERT INTO `propietario` (`idPropietario`, `DNI`, `telefono`, `apellidoPropietario`, `nombrePropietario`, `domicilio`) VALUES
(5, 1234, 23213, 'gd', 'vd', '');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id_usuario` int(11) NOT NULL,
  `nombre_usuario` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `email` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `telefono` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `username` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `password` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `tipo_nivel` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `estatus` varchar(50) COLLATE utf8_unicode_ci NOT NULL,
  `registrado_por` varchar(50) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci COMMENT='Esta tabla es para registro de usuarios';

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id_usuario`, `nombre_usuario`, `email`, `telefono`, `username`, `password`, `tipo_nivel`, `estatus`, `registrado_por`) VALUES
(1, 'Admin', 'saim22hernan@gmail.com', '', 'admin', '123456', 'Administrador', 'Activo', 'g5');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `contratoalquiler`
--
ALTER TABLE `contratoalquiler`
  ADD PRIMARY KEY (`idContrato`),
  ADD UNIQUE KEY `codContrato` (`codContrato`),
  ADD KEY `idPropiedad;` (`idPropiedad`),
  ADD KEY `idInquilino` (`idInquilino`);

--
-- Indices de la tabla `inquilino`
--
ALTER TABLE `inquilino`
  ADD PRIMARY KEY (`idInquilino`),
  ADD UNIQUE KEY `DNI` (`dni`),
  ADD UNIQUE KEY `cuit` (`cuit`),
  ADD UNIQUE KEY `dniGarante` (`dniGarante`);

--
-- Indices de la tabla `propiedad_inmueble`
--
ALTER TABLE `propiedad_inmueble`
  ADD PRIMARY KEY (`idPropiedad`),
  ADD UNIQUE KEY `codigo` (`codigo`),
  ADD KEY `dniPropietario` (`idPropietario`);

--
-- Indices de la tabla `propietario`
--
ALTER TABLE `propietario`
  ADD PRIMARY KEY (`idPropietario`),
  ADD UNIQUE KEY `DNI` (`DNI`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id_usuario`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `contratoalquiler`
--
ALTER TABLE `contratoalquiler`
  MODIFY `idContrato` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT de la tabla `inquilino`
--
ALTER TABLE `inquilino`
  MODIFY `idInquilino` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `propiedad_inmueble`
--
ALTER TABLE `propiedad_inmueble`
  MODIFY `idPropiedad` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=59;

--
-- AUTO_INCREMENT de la tabla `propietario`
--
ALTER TABLE `propietario`
  MODIFY `idPropietario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id_usuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `contratoalquiler`
--
ALTER TABLE `contratoalquiler`
  ADD CONSTRAINT `contratoalquiler_ibfk_2` FOREIGN KEY (`idPropiedad`) REFERENCES `propiedad_inmueble` (`idPropiedad`),
  ADD CONSTRAINT `contratoalquiler_ibfk_3` FOREIGN KEY (`idInquilino`) REFERENCES `inquilino` (`idInquilino`);

--
-- Filtros para la tabla `propiedad_inmueble`
--
ALTER TABLE `propiedad_inmueble`
  ADD CONSTRAINT `propiedad_inmueble_ibfk_3` FOREIGN KEY (`idPropietario`) REFERENCES `propietario` (`idPropietario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
