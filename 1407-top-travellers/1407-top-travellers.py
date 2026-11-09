import pandas as pd

def top_travellers(users: pd.DataFrame, rides: pd.DataFrame) -> pd.DataFrame:
    df=pd.merge(users,rides, left_on='id',right_on='user_id',how='left')
    df=(df.groupby(['id_x','name'],dropna=False)['distance'].sum().reset_index())
    df=df.rename(columns={'distance': 'travelled_distance'})
    return(
        df[['name','travelled_distance']].sort_values(by=['travelled_distance','name'],ascending=[False,True])
    )