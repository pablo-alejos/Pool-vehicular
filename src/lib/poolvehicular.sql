-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 13-12-2019 a las 03:16:59
-- Versión del servidor: 10.4.10-MariaDB
-- Versión de PHP: 7.1.33

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `poolvehicular`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `departamento`
--

CREATE TABLE `departamento` (
  `nombreDepartamento` varchar(50) NOT NULL,
  `nombreJefeDepartamento` text NOT NULL,
  `gasolinaPresupuestada` int(11) NOT NULL,
  `diaActualizarPresupuesto` int(11) NOT NULL,
  `gasolinaRestante` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `departamento`
--

INSERT INTO `departamento` (`nombreDepartamento`, `nombreJefeDepartamento`, `gasolinaPresupuestada`, `diaActualizarPresupuesto`, `gasolinaRestante`) VALUES
('Direccion de Educacion Superior para Profesio', 'Maribel Piña', 1000, 5, 300),
('Pagos', 'Benjamin Ocampo', 1000, 4, 900),
('Presupuesto', 'German Gandara', 1000, 3, 1000),
('Recursos Humanos', 'Juan Zazu', 1000, 2, 1000),
('Taller', 'Bustos', 1000, 1, 999);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `prestamo`
--

CREATE TABLE `prestamo` (
  `nump` int(11) NOT NULL,
  `cdv` int(11) NOT NULL,
  `tipo` text NOT NULL,
  `departamento` text NOT NULL,
  `nombreResguardante` text NOT NULL,
  `destinoMotivo` text NOT NULL,
  `aproxGasolina` int(11) NOT NULL,
  `fechaSalida` text NOT NULL,
  `horaSalida` text NOT NULL,
  `fechaEntrada` text DEFAULT NULL,
  `horaEntrada` text DEFAULT NULL,
  `valesGasolina` int(11) NOT NULL,
  `usuario` text NOT NULL,
  `estado` text NOT NULL DEFAULT 'en curso'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `prestamo`
--

INSERT INTO `prestamo` (`nump`, `cdv`, `tipo`, `departamento`, `nombreResguardante`, `destinoMotivo`, `aproxGasolina`, `fechaSalida`, `horaSalida`, `fechaEntrada`, `horaEntrada`, `valesGasolina`, `usuario`, `estado`) VALUES
(14, 1, 'Local', 'Direccion de Educacion Superior para Profesio', 'Pablo', 'Mensajeria', 71, '11 12 2019', '05:35:40 a. m.', '11 12 2019', '05:35:54 a. m.', 100, 'Encargado', 'terminado'),
(15, 20, 'Local', 'Pagos', 'yo', 'yo', 49, '11 12 2019', '06:11:10 p. m.', '11 12 2019', '06:11:44 p. m.', 100, 'Encargado', 'terminado'),
(16, 2, 'Local', 'Direccion de Educacion Superior para Profesio', 'tu', 'Obregon', 68, '11 12 2019', '06:15:15 p. m.', NULL, NULL, 100, 'Encargado', 'En curso');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vehiculo`
--

CREATE TABLE `vehiculo` (
  `cdv` int(11) NOT NULL,
  `placas` text NOT NULL,
  `tipo` text NOT NULL,
  `marca` text NOT NULL,
  `modelo` text NOT NULL,
  `estado` text NOT NULL DEFAULT 'disponible'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `vehiculo`
--

INSERT INTO `vehiculo` (`cdv`, `placas`, `tipo`, `marca`, `modelo`, `estado`) VALUES
(2, 'BB11', 'Oficial', 'Nissan', 'Versa', 'prestado'),
(3, 'CC22', 'Oficial', 'Nissan', 'Versa', 'disponible'),
(10, 'DD33', 'Oficial', 'Nissan', 'Versa', 'prestado'),
(20, 'EE44', 'Oficial', 'Nissan', 'Versa', 'disponible'),
(30, 'FF55', 'Oficial', 'Nissan', 'Versa', 'disponible'),
(40, 'GG66', 'Oficial', 'Nissan', 'Versa', 'disponible'),
(50, 'HH77', 'Oficial', 'Nissan', 'Versa', 'prestado'),
(60, 'II88', 'Oficial', 'Nissan', 'Versa', 'disponible');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `departamento`
--
ALTER TABLE `departamento`
  ADD PRIMARY KEY (`nombreDepartamento`);

--
-- Indices de la tabla `prestamo`
--
ALTER TABLE `prestamo`
  ADD PRIMARY KEY (`nump`);

--
-- Indices de la tabla `vehiculo`
--
ALTER TABLE `vehiculo`
  ADD PRIMARY KEY (`cdv`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `prestamo`
--
ALTER TABLE `prestamo`
  MODIFY `nump` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
