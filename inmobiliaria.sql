-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 13-07-2022 a las 22:38:21
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
(25, 'CA5925', '', 59, 10, '2022-07-05', '2022-07-11'),
(26, 'CA5926', '', 59, 10, '2022-07-13', '2022-07-31');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inquilino`
--

CREATE TABLE `inquilino` (
  `idInquilino` int(11) NOT NULL,
  `dni` int(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `cuit` bigint(50) NOT NULL,
  `telefono` int(50) NOT NULL,
  `trabajo` varchar(50) NOT NULL,
  `apellidoGarante` varchar(50) NOT NULL,
  `nombreGarante` varchar(50) NOT NULL,
  `dniGarante` int(50) NOT NULL,
  `activo` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `inquilino`
--

INSERT INTO `inquilino` (`idInquilino`, `dni`, `apellido`, `nombre`, `cuit`, `telefono`, `trabajo`, `apellidoGarante`, `nombreGarante`, `dniGarante`, `activo`) VALUES
(10, 32680177, 'Ferrieres', 'Mauricio', 20326801772, 266507604, 'kine', 'dfds', 'fdsfds', 213213, 1),
(11, 23212321, 'castania', 'cacho', 22232123211, 32432423, 'cantante', 'sdsad', 'sdsa', 2321, 1),
(12, 243213, 'sosa', 'pedro', 232432132, 32432, 'dsfds', 'dfsd', 'dfds', 32432, 1),
(13, 1234, 'fernandez', 'cristian', 2012346, 234213, '35345', 'df', 'dfds', 2321, 0),
(14, 32432, 'sadsa', 'sda', 213, 213, 'sda', 'sda', 'sadsa', 23, 1);

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
  `idPropietario` int(11) NOT NULL,
  `vigente` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `propiedad_inmueble`
--

INSERT INTO `propiedad_inmueble` (`idPropiedad`, `codigo`, `direccion`, `zona`, `tipo`, `superficie`, `precio`, `idPropietario`, `vigente`) VALUES
(59, 'CA59', 'las chacras 23', 'NORTE', 'CASA', 234, 128000, 10, 1),
(60, 'CO60', 'san martin 654', 'ESTE', 'COMERCIAL', 123, 230000, 10, 1),
(61, 'DE61', 'chacabuco 874', 'CENTRO', 'DEPARTAMENTO', 234, 2300004, 11, 1),
(62, 'DE62', 'junin 1234', 'CENTRO', 'DEPARTAMENTO', 236, 2300004, 11, 1),
(63, 'DE63', 'falucho 2321', 'NORTE', 'DEPARTAMENTO', 2364, 2300004, 12, 1),
(64, 'DE64', 'buenos aires 45', 'NORTE', 'DEPARTAMENTO', 56, 45322, 12, 1);

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
  `domicilio` varchar(50) NOT NULL,
  `activo` tinyint(4) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `propietario`
--

INSERT INTO `propietario` (`idPropietario`, `DNI`, `telefono`, `apellidoPropietario`, `nombrePropietario`, `domicilio`, `activo`) VALUES
(10, 23675349, 266785456, 'perez', 'raul', 'chacabuco 234', 1),
(11, 76455756, 2335566, 'martinez', 'luciano', 'belgrano234', 1),
(12, 4342545, 23213, 'carrasco', 'Maria', 'las heras 456', 1);

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
  ADD KEY `idPropiedad` (`idPropiedad`),
  ADD KEY `idInquilino` (`idInquilino`);

--
-- Indices de la tabla `inquilino`
--
ALTER TABLE `inquilino`
  ADD PRIMARY KEY (`idInquilino`);

--
-- Indices de la tabla `propiedad_inmueble`
--
ALTER TABLE `propiedad_inmueble`
  ADD PRIMARY KEY (`idPropiedad`),
  ADD KEY `idPropietario` (`idPropietario`);

--
-- Indices de la tabla `propietario`
--
ALTER TABLE `propietario`
  ADD PRIMARY KEY (`idPropietario`);

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
  MODIFY `idContrato` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=27;

--
-- AUTO_INCREMENT de la tabla `inquilino`
--
ALTER TABLE `inquilino`
  MODIFY `idInquilino` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT de la tabla `propiedad_inmueble`
--
ALTER TABLE `propiedad_inmueble`
  MODIFY `idPropiedad` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=65;

--
-- AUTO_INCREMENT de la tabla `propietario`
--
ALTER TABLE `propietario`
  MODIFY `idPropietario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

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
  ADD CONSTRAINT `contratoalquiler_ibfk_1` FOREIGN KEY (`idPropiedad`) REFERENCES `propiedad_inmueble` (`idPropiedad`),
  ADD CONSTRAINT `contratoalquiler_ibfk_2` FOREIGN KEY (`idInquilino`) REFERENCES `inquilino` (`idInquilino`);

--
-- Filtros para la tabla `propiedad_inmueble`
--
ALTER TABLE `propiedad_inmueble`
  ADD CONSTRAINT `propiedad_inmueble_ibfk_1` FOREIGN KEY (`idPropietario`) REFERENCES `propietario` (`idPropietario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
