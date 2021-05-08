import BarChar from "components/BarChart";
import DataTable from "components/DataTable";
import DonutChart from "components/DonutChart";
import Footer from "components/Footer";
import NavBar from "components/NavBar";
import React from "react";

const Dashnboard = () => {
    return (

        <>
            <NavBar />
            <div className="container">
                <h1 className="text-primary py-3">Dashboard de Vendas</h1>
                <div className="row px-3">
                    <div className="col-sm-6">
                        <h5 className="ext-center text-secondary">Taxa de suscesso(%)</h5>
                        <BarChar />
                    </div>
                    <div className="col-sm-6">
                        <h5 className="ext-center text-secondary">Todas vendas</h5>
                        <DonutChart />
                    </div>
                </div>
                <div className="pt-3">
                    <h2 className="text-primary">Todas as vendas</h2>
                </div>
                <DataTable />
            </div>
            <Footer />
        </>

    );
}

export default Dashnboard;