-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : mar. 12 oct. 2021 à 21:15
-- Version du serveur : 10.4.20-MariaDB
-- Version de PHP : 7.3.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `odk_db`
--

-- --------------------------------------------------------

--
-- Structure de la table `apprenant`
--

CREATE TABLE `apprenant` (
  `id_apprenant` int(11) NOT NULL,
  `apprenant_status` varchar(255) DEFAULT NULL,
  `age` int(11) NOT NULL,
  `create_date` datetime DEFAULT NULL,
  `email_apprenant` varchar(255) DEFAULT NULL,
  `login_apprenant` varchar(255) DEFAULT NULL,
  `modify_date` datetime DEFAULT NULL,
  `nom_apprenant` varchar(255) DEFAULT NULL,
  `password_apprenant` varchar(255) DEFAULT NULL,
  `prenom_apprenant` varchar(255) DEFAULT NULL,
  `telphone` bigint(20) NOT NULL,
  `login` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `apprenant`
--

INSERT INTO `apprenant` (`id_apprenant`, `apprenant_status`, `age`, `create_date`, `email_apprenant`, `login_apprenant`, `modify_date`, `nom_apprenant`, `password_apprenant`, `prenom_apprenant`, `telphone`, `login`, `password`) VALUES
(13, 'Activer', 18, NULL, 'mady@gmail.com', 'PAS', NULL, 'Camara', '12345678', 'Mady', 34445666, NULL, NULL),
(14, 'Activer', 18, NULL, 'mady@gmail.com', NULL, NULL, 'Guindo', NULL, 'Amagaraï', 234456777, 'papi', 'azerty');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `apprenant`
--
ALTER TABLE `apprenant`
  ADD PRIMARY KEY (`id_apprenant`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `apprenant`
--
ALTER TABLE `apprenant`
  MODIFY `id_apprenant` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
